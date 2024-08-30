import java.util.*;

public class DuplicateWords {
 public static void main(String args[]) {
	 String sentence="abc abgg cghjj abc abmmm abgg";
	 DuplicateWords d=new DuplicateWords();
	 d.dupWords(sentence);
 }
 public void dupWords(String sentence) {
	 String words[]=sentence.split(" ");
	 Map<String, Integer> freqMap=new HashMap();
	 for(int i=0;i<words.length;i++) {
		 freqMap.put(words[i],freqMap.getOrDefault(words[i], 0)+1);
	 }
	 for(Map.Entry<String, Integer> map:freqMap.entrySet()) {
		 if(map.getValue()>1)
			 System.out.println(map.getKey());
	 }
 }
}
