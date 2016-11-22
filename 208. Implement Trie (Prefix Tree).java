class TrieNode {
    boolean isLeaf;
    TrieNode[] arr;
    // Initialize your data structure here.
    public TrieNode() {
        arr = new TrieNode[26];
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(p.arr[index] != null){
                p = p.arr[index];
            }
            else{
                TrieNode t = new TrieNode();
                p.arr[index] = t;
                p = p.arr[index];
            }
        }
        p.isLeaf = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(p.arr[index] != null){
                p = p.arr[index];
            }
            else{
                return false;
            }
        }
        return p.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            int index = c - 'a';
            if(p.arr[index] != null){
                p = p.arr[index];
            }
            else{
                return false;
            }
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");