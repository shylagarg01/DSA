class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
       HashMap<String, Integer> map = new HashMap<>();
       for(String cpdomain:cpdomains){
        String[] parts = cpdomain.split(" ");
        int c = Integer.parseInt(parts[0]);
        String domain = parts[1];
        while(true){
            map.put(domain, map.getOrDefault(domain,0) + c);

 
        int index = domain.indexOf('.');
        if(index==-1){
            break;
        }
        domain = domain.substring(index+1);
 
       }
       }
       List<String> result = new ArrayList<>();
       for(String cpdomain:map.keySet()){
         result.add(map.get(cpdomain) + " " + cpdomain);
        }
        return result;
 
    }
 
}
