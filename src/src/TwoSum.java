package src;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}

}
