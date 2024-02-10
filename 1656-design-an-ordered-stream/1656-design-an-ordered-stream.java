class OrderedStream {
    int n ;
    String[] str;
    public OrderedStream(int n) {
        this.n = n;
        str = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        str[idKey-1]=value;
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i<idKey-1 ; i++){
            if(str[i]==null)return list;
        }
        for(int i = idKey-1; i<n; i++){
            if(str[i]==null)break;
            list.add(str[i]);
        }
        return list;
    }
}