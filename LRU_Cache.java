






/*
 * https://docs.google.com/document/d/1TSJ_2f9KfyPdkUp9MwHbfIks8bihj5rmMhc2y-rxzKM/edit?tab=t.0#heading=h.wsyef8ev9na0
 * LRU Cache Implementation - Room 5
Design and implement a Least Recently Used (LRU) cache. The cache should support the following operations in O(1) time complexity:
get(int key): Returns the value associated with the key if it exists, otherwise return -1.
put(int key, int value): Insert or update the key-value pair. If the cache reaches its capacity, remove the least recently used item before inserting a new one.
The cache follows the Least Recently Used (LRU) policy, meaning the least recently accessed element is removed when the cache is full.
Example Usage:
LRUCache cache(2); // Capacity = 2

cache.put(1, 10);
cache.put(2, 20);

cout << cache.get(1) << endl; // Output: 10 (1 is now most recently used)

cache.put(3, 30); // Removes key 2 (Least Recently Used), because capacity is of size 2

cout << cache.get(2) << endl; // Output: -1 (Key 2 was evicted)
cout << cache.get(3) << endl; // Output: 30

Keywords/Hints:
doubly linked list
hash map 
On a get(), the searched element becomes the most recently used one.
On a put(), inserted element is the most recent one used.
Don’t forget to take into consideration the cache capacity

 */