class pair{
    String first;
    int sec;
    pair(String first, int sec){
        this.first = first;
        this.sec = sec;
    }
}

class Solution {
    public int wordLadderLength(String startWord, String targetWord,
                                String[] wordList) {
        // Code here
        Queue<pair> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        
        q.offer(new pair(startWord, 1));
        for(int i=0;i<wordList.length;i++){
            set.add(wordList[i]);
        }
        if(!set.contains(targetWord)) return 0;
        
        set.remove(startWord);
        while(!q.isEmpty()){
            pair curr = q.poll();
            String word = curr.first;
            int step = curr.sec;
            if(word.equals(targetWord)) return step;
            
            for(int i=0;i<word.length();i++){
                for(char ch = 'a';ch<='z';ch++){
                    char[] replacedCharArr = word.toCharArray();
                    replacedCharArr[i] = ch;
                    String replacedWord = new String(replacedCharArr);
                    if(set.contains(replacedWord)){
                        set.remove(replacedWord);
                        q.add(new pair(replacedWord, step+1));
                    }
                }
            }
        }
        return 0;
    }
}