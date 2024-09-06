class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Create a HashSet to store the values from the nums array
        HashSet<Integer> st = new HashSet<>();
        for (int x : nums) {
            st.add(x); // Add each number in nums to the set for O(1) lookup
        }

        // Step 2: Move the pointer to skip over nodes at the beginning of the list
        // that have values present in the HashSet
        ListNode ptr = head;
        while (ptr != null && st.contains(ptr.val)) {
            ptr = ptr.next; // Skip nodes whose values exist in the set
        }

        // Update head to point to the first node that isn't in the set
        head = ptr;

        // Step 3: Traverse the rest of the linked list and remove nodes with values in the HashSet
        while (ptr != null && ptr.next != null) {
            // If the next node's value is in the set, bypass it
            while (ptr.next != null && st.contains(ptr.next.val)) {
                ptr.next = ptr.next.next; // Skip over the next node
            }
            // Move the pointer forward to the next node in the list
            ptr = ptr.next;
        }

        // Step 4: Return the modified list starting from the updated head
        return head;
    }
}