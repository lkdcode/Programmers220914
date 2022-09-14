class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int[] arr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 32) {
				answer += ' ';
				continue;
			} else if (arr[i] >= 65 && arr[i] <= 90) {
				if (arr[i] + n > 90) {
					answer += (char) (arr[i] + n - 26);
					continue;
				} else {
					answer += (char) (arr[i] + n);
				}
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				if (arr[i] + n > 122) {
					answer += (char) (arr[i] + n - 26);
					continue;
				} else {
					answer += (char) (arr[i] + n);
				}

			}
		}
        
        
        return answer;
    }
}