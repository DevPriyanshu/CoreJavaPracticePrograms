import java.util.*;

class Anagrams {
	public static List<List<String>> groupAnagrams(String[] s)
	{
		List<List<String>> r=new ArrayList<>();
		
		HashMap<String, List<String>> map=new HashMap<>();
		
		for(String str:s)
		{
			char[] ch_arr=str.toCharArray();
			
			Arrays.sort(ch_arr);
			
			String k=new String(ch_arr);
			
			if(map.containsKey(k))
			{
				map.get(k).add(str);
			}
			else
			{
				List<String> s_list=new ArrayList<>();
				s_list.add(str);
				map.put(k,s_list);
			}
		}
		
		r.addAll(map.values());
		return r;
	}
	public static void main(String[] args) 
	{
		String[] s= {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> rs=groupAnagrams(s);
		
		rs.forEach(t -> System.out.println(t+" "));
	}
}