import threading
import time
import random


def execute_thread(n):
    print("Thread {} sleeps at {}".format(n , time.strftime("%H:%M:%S", time.localtime())))
    random_sleep_time = random.randint(1, 4)
    time.sleep(random_sleep_time)
    print("Thread {} stops sleeping at {}".format(n, time.strftime("%H:%M:%S", time.gmtime())))


for i in range(2):
    thread = threading.Thread(target=execute_thread, args=(i))
    thread.start()
    print("Active Threads :", threading.active_count())
    print("Thread Object :", threading.enumerate())
