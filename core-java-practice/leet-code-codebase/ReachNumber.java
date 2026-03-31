class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); 
        int numMoves=0;
        int move=0;
        while(numMoves < target || (numMoves - target) % 2 != 0){
            move++;
            numMoves += move;
        }
        return move;
    }
}