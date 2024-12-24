# 📚 DataStructures-Algorithms-Java

## 📂 Array

### 🟢 Easy

1. **🔍 Maximum and Minimum Element in an Array**
   - **📄 File:** [ARRAY/EASY/MaxMin.java](ARRAY/EASY/MaxMin.java)
   - **📝 Description:** Finds the maximum and minimum elements in an array.
   - **💡 Solution:** Uses sorting to find the minimum and maximum values.

2. **🔄 Reverse the Array**
   - **📄 File:** [ARRAY/EASY/Reverse.java](ARRAY/EASY/Reverse.java)
   - **📝 Description:** Reverses the elements of an array.
   - **💡 Solution:** Swaps elements from the start and end of the array moving towards the center.

3. **🔢 Print Sub Array**
   - **📄 File:** [ARRAY/EASY/SubArray.java](ARRAY/EASY/SubArray.java)
   - **📝 Description:** Prints all possible subarrays of an array.
   - **💡 Solution:** Uses nested loops to generate and print subarrays.

4. **📈 Print Max Sub Array**
   - **📄 File:** [ARRAY/EASY/MaxSubArray.java](ARRAY/EASY/MaxSubArray.java)
   - **📝 Description:** Finds the maximum sum subarray using Kadane's algorithm.
   - **💡 Solution:** Iterates through the array, maintaining the current sum and updating the maximum sum.

5. **🔍 Contains Duplicate**
   - **📄 File:** [ARRAY/EASY/ContainsDuplicate.java](ARRAY/EASY/ContainsDuplicate.java)
   - **📝 Description:** Checks if the array contains any duplicates.
   - **💡 Solution:** Sorts the array and checks for consecutive duplicate elements.

6. **🍫 Chocolate Distribution Problem**
   - **📄 File:** [ARRAY/EASY/ChocolateDistribution.java](ARRAY/EASY/ChocolateDistribution.java)
   - **📝 Description:** Distributes chocolates such that the difference between the maximum and minimum chocolates given to students is minimized.
   - **💡 Solution:** Sorts the array and uses a sliding window to find the minimum difference.

### 🟡 Medium

1. **🔄 Next Permutation**
   - **📄 File:** [ARRAY/MEDIUM/NextPermutation.java](ARRAY/MEDIUM/NextPermutation.java)
   - **📝 Description:** Finds the next lexicographical permutation of the array.
   - **💡 Solution:** Identifies the first decreasing element, swaps it with the next larger element, and reverses the subarray.

## 📂 LinkedList

1. **🔄 Circular Linked List**
   - **📄 File:** [LINKEDLIST/CircularLL.java](LINKEDLIST/CircularLL.java)
   - **📝 Description:** Implements a circular linked list with operations to add and delete nodes.
   - **💡 Solution:** Uses a circular structure where the last node points to the first node.

2. **🔍 Cycle Detection**
   - **📄 File:** [LINKEDLIST/CycleDetection.java](LINKEDLIST/CycleDetection.java)
   - **📝 Description:** Detects a cycle in a linked list and finds the starting node of the cycle.
   - **💡 Solution:** Uses Floyd's cycle-finding algorithm (tortoise and hare).

3. **🔄 Double Linked List**
   - **📄 File:** [LINKEDLIST/DoubleLL.java](LINKEDLIST/DoubleLL.java)
   - **📝 Description:** Implements a doubly linked list with operations to add, remove, and reverse nodes.
   - **💡 Solution:** Uses nodes with pointers to both the next and previous nodes.

4. **🔗 Linked List**
   - **📄 File:** [LINKEDLIST/LinkedList.java](LINKEDLIST/LinkedList.java)
   - **📝 Description:** Implements a singly linked list with various operations such as add, remove, search, and reverse.
   - **💡 Solution:** Uses nodes with pointers to the next node.

## 📂 HashMap

1. **🔍 HashMap Methods**
   - **📄 File:** [HASHMAP/Main.java](HASHMAP/Main.java)
   - **📝 Description:** Demonstrates various operations on a HashMap such as adding, updating, removing, and traversing elements.
   - **💡 Solution:** Uses Java's `HashMap` class to perform the operations.

## 📂 Binary Search Tree (BST)

1. **🌳 Build BST**
   - **📄 File:** [BST/BuildBst.java](BST/BuildBst.java)
   - **📝 Description:** Builds a binary search tree (BST) and performs inorder traversal.
   - **💡 Solution:** Inserts nodes into the BST and uses recursion for inorder traversal.

2. **🔍 Search in BST**
   - **📄 File:** [BST/Searchbst.java](BST/Searchbst.java)
   - **📝 Description:** Searches for a key in a binary search tree (BST).
   - **💡 Solution:** Uses recursion to traverse the BST and find the key.

## 📂 Queue

1. **📄 Array Implementation of Queue**
   - **📄 File:** [QUEUE/ArrayImp.java](QUEUE/ArrayImp.java)
   - **📝 Description:** Implements a queue using an array with operations to add, remove, and peek elements.
   - **💡 Solution:** Uses an array to store elements and maintains pointers for the front and rear of the queue.

2. **📄 Queue Example**
   - **📄 File:** [QUEUE/example.java](QUEUE/example.java)
   - **📝 Description:** Demonstrates basic queue operations using Java's `LinkedList` class.
   - **💡 Solution:** Uses Java's `Queue` interface and `LinkedList` class to perform the operations.

3. **🔄 Interleave Queue**
   - **📄 File:** [QUEUE/Interleave.java](QUEUE/Interleave.java)
   - **📝 Description:** Interleaves the first half of the queue with the second half.
   - **💡 Solution:** Uses an auxiliary queue to store the first half and interleaves it with the second half.

4. **🔗 Linked List Implementation of Queue**
   - **📄 File:** [QUEUE/LLImplementationQueue.java](QUEUE/LLImplementationQueue.java)
   - **📝 Description:** Implements a queue using a linked list with operations to add, remove, and display elements.
   - **💡 Solution:** Uses nodes with pointers to the next node to form the queue.

5. **🔄 Queue Using Two Stacks**
   - **📄 File:** [QUEUE/Question2.java](QUEUE/Question2.java)
   - **📝 Description:** Implements a queue using two stacks with operations to add, remove, and peek elements.
   - **💡 Solution:** Uses two stacks to simulate the queue operations.

6. **🔍 First Non-Repeating Character in Stream**
   - **📄 File:** [QUEUE/Question4.java](QUEUE/Question4.java)
   - **📝 Description:** Finds the first non-repeating character in a stream of characters.
   - **💡 Solution:** Uses a queue and an array to keep track of character frequencies.

7. **🔄 Reverse Queue**
   - **📄 File:** [QUEUE/reverseQueue.java](QUEUE/reverseQueue.java)
   - **📝 Description:** Reverses the elements of a queue.
   - **💡 Solution:** Uses a stack to reverse the elements of the queue.

8. **🔄 Reverse First K Elements of Queue**
   - **📄 File:** [QUEUE/reverse_1st_Kelement.java](QUEUE/reverse_1st_Kelement.java)
   - **📝 Description:** Reverses the first K elements of a queue.
   - **💡 Solution:** Uses a stack to reverse the first K elements and then re-adds the remaining elements.

9. **🔄 Stack Using Two Queues**
   - **📄 File:** [QUEUE/StackUsingTwoQueues.java](QUEUE/StackUsingTwoQueues.java)
   - **📝 Description:** Implements a stack using two queues with operations to push, pop, and peek elements.
   - **💡 Solution:** Uses two queues to simulate the stack operations.

## 📂 Recursive

1. **🔄 Permutation**
   - **📄 File:** [RECURCIVE/Permutation.java](RECURCIVE/Permutation.java)
   - **📝 Description:** Finds all permutations of a given string.
   - **💡 Solution:** Uses recursion to generate permutations by fixing each character and finding permutations of the remaining string.

2. **🔄 Subset**
   - **📄 File:** [RECURCIVE/Subset.java](RECURCIVE/Subset.java)
   - **📝 Description:** Finds all subsets of a given string.
   - **💡 Solution:** Uses recursion to generate subsets by including or excluding each character.

## 📂 Stack

1. **🔗 Stack Using Linked List**
   - **📄 File:** [STACK/StackLL.java](STACK/StackLL.java)
   - **📝 Description:** Implements a stack using a linked list with operations to push, pop, and peek elements.
   - **💡 Solution:** Uses nodes with pointers to the next node to form the stack.

2. **🔄 Push at Bottom**
   - **📄 File:** [STACK/StackQuestion.java/StackQ1.java](STACK/StackQuestion.java/StackQ1.java)
   - **📝 Description:** Pushes an element at the bottom of the stack.
   - **💡 Solution:** Uses recursion to reach the bottom of the stack and then pushes the element.

3. **🔄 Reverse a String Using Stack**
   - **📄 File:** [STACK/StackQuestion.java/StackQ2.java](STACK/StackQuestion.java/StackQ2.java)
   - **📝 Description:** Reverses a string using a stack.
   - **💡 Solution:** Pushes each character of the string onto the stack and then pops them to get the reversed string.

4. **🔄 Reverse a Stack**
   - **📄 File:** [STACK/StackQuestion.java/StackQ3.java](STACK/StackQuestion.java/StackQ3.java)
   - **📝 Description:** Reverses the elements of a stack.
   - **💡 Solution:** Uses recursion to reverse the stack by pushing elements at the bottom.

5. **📈 Stock Span Problem**
   - **📄 File:** [STACK/StackQuestion.java/StackQ4.java](STACK/StackQuestion.java/StackQ4.java)
   - **📝 Description:** Finds the stock span for each day.
   - **💡 Solution:** Uses a stack to keep track of previous higher stock prices.

6. **🔍 Next Greater Element**
   - **📄 File:** [STACK/StackQuestion.java/StackQ5.java](STACK/StackQuestion.java/StackQ5.java)
   - **📝 Description:** Finds the next greater element for each element in the array.
   - **💡 Solution:** Uses a stack to keep track of elements and their next greater elements.

7. **✅ Valid Parentheses**
   - **📄 File:** [STACK/StackQuestion.java/validParentheses.java](STACK/StackQuestion.java/validParentheses.java)
   - **📝 Description:** Checks if the given string of parentheses is valid.
   - **💡 Solution:** Uses a stack to match opening and closing parentheses.

## 📂 Tree

1. **🌳 Build Tree**
   - **📄 File:** [TREE/BuildTree.java](TREE/BuildTree.java)
   - **📝 Description:** Builds a binary tree from a given array representation.
   - **💡 Solution:** Uses recursion to build the tree and performs various tree traversals.

2. **🔢 Count Nodes**
   - **📄 File:** [TREE/CountNode.java](TREE/CountNode.java)
   - **📝 Description:** Counts the number of nodes in a binary tree.
   - **💡 Solution:** Uses recursion to count the nodes.

3. **📏 Diameter of Tree**
   - **📄 File:** [TREE/Diameter.java](TREE/Diameter.java)
   - **📝 Description:** Finds the diameter of a binary tree.
   - **💡 Solution:** Uses recursion to calculate the diameter by finding the longest path between two nodes.

4. **📏 Height of Tree**
   - **📄 File:** [TREE/Heightoftree.java](TREE/Heightoftree.java)
   - **📝 Description:** Finds the height of a binary tree.
   - **💡 Solution:** Uses recursion to calculate the height by finding the longest path from the root to a leaf.

5. **🔢 Kth Level Nodes**
   - **📄 File:** [TREE/Kth_level.java](TREE/Kth_level.java)
   - **📝 Description:** Finds all nodes at the Kth level of a binary tree.
   - **💡 Solution:** Uses recursion to traverse the tree and print nodes at the Kth level.

6. **✅ Same Tree**
   - **📄 File:** [TREE/SameTree.java](TREE/SameTree.java)
   - **📝 Description:** Checks if two binary trees are the same.
   - **💡 Solution:** Uses recursion to compare the structure and values of two trees.

7. **🌳 Subtree**
   - **📄 File:** [TREE/subtree.java](TREE/subtree.java)
   - **📝 Description:** Checks if one tree is a subtree of another.
   - **💡 Solution:** Uses recursion to check if the subtree matches any part of the main tree.

8. **🌳 Lowest Common Ancestor**
   - **📄 File:** [TREE/LowestCommonAncestor.java](TREE/LowestCommonAncestor.java)
   - **📝 Description:** Finds the lowest common ancestor (LCA) of two nodes in a binary tree.
   - **💡 Solution:** Uses recursion to find the LCA by checking the left and right subtrees.