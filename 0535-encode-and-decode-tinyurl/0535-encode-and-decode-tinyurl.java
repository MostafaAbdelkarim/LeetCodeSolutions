public class Codec {
    
    final Map<Integer, String> map = new HashMap();
    final String host = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        final int key = longUrl.hashCode();
        map.put(key, longUrl);
        return host + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        final int key = Integer.parseInt(shortUrl.replace(host,""));
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));