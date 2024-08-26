class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        final Set<Integer> visited = new HashSet<>();
        final Stack<Integer> stack = new Stack<>();
        
        visited.add(0);
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int currentRoom = stack.pop();
            for (int key : rooms.get(currentRoom)) {
                if (!visited.contains(key)) {
                    visited.add(key);
                    stack.push(key);
                }
            }
        }
        
        return visited.size() == rooms.size();
    }
}