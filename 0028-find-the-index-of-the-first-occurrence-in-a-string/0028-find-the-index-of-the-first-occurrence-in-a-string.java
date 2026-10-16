// class Solution {
//     public int strStr(String haystack, String needle) {
//         int n = needle.length();
//         int m = haystack.length();

//         if (n > m) {
//             return -1;
//         }

//         for (int i = 0; i <= m - n; i++) {
//             int j = 0;

//             while (j < n &&
//                    haystack.charAt(i + j) == needle.charAt(j)) {
//                 j++;
//             }

//             if (j == n) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }



class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}