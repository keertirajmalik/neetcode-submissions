class Solution {
    public String encode(List<String> strs) {
        String encode = "";
        for (String str : strs) {
            encode = encode + "%" + str.length() + "%" + str;
        }
        return encode;
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList();

        while (str.length() > 0) {
            String count = str.split("%", 3)[1];
            int length = count.length() + 2 + Integer.parseInt(count);
            decode.add(str.substring(count.length() + 2, length));
            str = str.substring(length, str.length());
        }
        return decode;
    }
}
