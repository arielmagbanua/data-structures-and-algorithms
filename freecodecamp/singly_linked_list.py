from typing import Counter

class Node:
    """
    An object for storing a single node of a linked list.
    Models two attributes - data and the link to the next node in the list.
    
    Attributes:
        data: Data stored in node
        next_node: Reference to next node in linked list
    """

    def __init__(self, data, next_node = None) -> None:
        self.data = data
        self.next_node = next_node

    def __repr__(self) -> str:
        return "<Node data: %s>" % self.data

class SinglyLinkedList:
    """
    Linear data structure that stores values in nodes. The list maintains a reference to the first node, also called head. Each node points to the next node in the list

    Attributes:
        head: The head node of the list
    """

    def __init__(self) -> None:
        self.head = None

        # Maintaining a count attribute allows for len() to be implemented in constant time
        self.__count = 0

    def is_empty(self):
        """
        Determines if the linked list is empty

        Takes O(1) time
        """

        return self.head is None

    def size(self):
        """
        Returns the number of nodes in the list

        Takes 0(n) time
        """

        current = self.head
        count = 0

        while current:
            count += 1
            current = current.next_node

        return count

    def add(self, data):
        """
        Adds new Node containing data to head of the list
        Also called prepend

        Takes O(1) time
        """

        new_head = Node(data, next_node=self.head)
        self.head = new_head
        self.__count += 1

    def search(self, key):
        """
        Search for the first node containing data that matches the key
        Returns the node or 'None' if not found

        Takes 0(n) time
        """
        
        current = self.head

        while current:
            if current.data == key:
                return current
            else:
                current = current.next_node

        return None

    def insert(self, data, index):
        """
        Inserts a new Node containing data at index position
        Insertion take 0(1) time but finding the node at the insertion point takes 0(n) time

        Takes overall 0(n) time
        """

        if index >= self.__count:
            raise IndexError('index out of range')

        if index == 0:
            self.add(data)
            return

        if index > 0:
            new = Node(data)
            position = index
            current = self.head

            while position > 1:
                current.next_node
                position -= 1

            prev_node = current
            next_node = current.next_node

            prev_node.next_node = new
            new.next_node = next_node

        self.__count += 1

    def remove(self, key):
        """
        Removes Node containing data that matches the key
        Returns the node or `None` if key doesn't exist

        Takes O(n) time
        """

        current = self.head
        previous = None
        found = False

        while current and not found:
            if current.data == key and current is self.head:
                found = True
                self.head = current.next_node
                self.__count -= 1
                return current
            elif current.data == key:
                found = True
                previous.next_node = current.next_node
                self.__count -= 1
                return current
            else:
                previous = current
                current = current.next_node

        return None

    def __repr__(self):
        """
        Return a string representation of the list.

        Takes O(n) time.
        """

        nodes = []
        current = self.head
        while current:
            if current is self.head:
                nodes.append("[Head: %s]" % current.data)
            elif current.next_node is None:
                nodes.append("[Tail: %s]" % current.data)
            else:
                nodes.append("[%s]" % current.data)
            current = current.next_node
        return  '-> '.join(nodes)

# n1 = Node(10)
# n2 = Node(20)
# n1.next_node = n2

l = SinglyLinkedList()
l.add(10)
l.add(2)
l.add(45)
l.add(15)

data = l.search(45)

print(data)
