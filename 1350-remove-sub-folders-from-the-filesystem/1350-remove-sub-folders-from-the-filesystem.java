import java.util.*;

public class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        Set<String> folderSet = new HashSet<>(Arrays.asList(folder));
        
        Arrays.sort(folder, (a, b) -> a.length() - b.length());
        
        for (String f : folder) {
            boolean isSubfolder = false;
            for (int i = 2; i < f.length(); i++) {
                if (f.charAt(i) == '/' && folderSet.contains(f.substring(0, i))) {
                    isSubfolder = true;
                    break;
                }
            }
            if (!isSubfolder) {
                ans.add(f);
            }
        }
        
        return ans;
    }
}
