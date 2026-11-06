# R2-Q1: Subtitle service 10+ videos pe crash karti hai - workarounds

**Source:** Round 2, system-design discussion. **Pehle khud workarounds sochke likho.**

## Question
Service har video ke liye naya thread chalati hai (processor-intensive). Single process, ek machine pe. Bug: 10 se zyada videos ek saath ho to poora server crash, saari in-progress requests lost aur doosre processes bhi affected. Bug fix hone me time lagega. Tab tak service chalane ke liye kya workarounds?

## Model answer (spoiler)
1. **Concurrency limit:** bounded thread pool / semaphore (max ~8-10, ya cores ke hisaab se). CPU-bound kaam ke liye threads ~ cores.
2. **Queue:** limit se zyada requests queue me wait karein, drop nahi. Queue durable ho (SQS/RabbitMQ/Kafka/DB table) taaki crash me requests lost na hon.
3. **Job state persist:** har job ka status (queued / running / done / failed) DB me. Restart ke baad incomplete jobs dobara uthao (retry, idempotent).
4. **Isolation:** service ko alag machine / container pe, CPU+memory limits (cgroups / k8s) ke saath, taaki crash baaki processes ko affect na kare.
5. **Process-per-video / worker processes:** ek video crash kare to sirf wahi process mare. Supervisor (systemd / k8s) auto-restart kare.
6. **Backpressure:** queue bhar jaye to client ko 429 / "busy" ya estimated wait time.
7. **Horizontal scale:** multiple workers machines pe, queue se pull karein, total concurrency control me.
8. **Monitoring / alerts:** concurrent jobs, memory, CPU, crash count; bug reproduce karne ke liye heap/thread dumps.

## Follow-ups / traps
- Pool size kaise decide: load test karke, cores aur memory dekhke.
- Poison job: ek hi video baar baar crash kare to retry limit + dead-letter queue.
