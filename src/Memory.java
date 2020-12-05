import java.util.HashMap;
import java.util.Map;

public class Memory {
    // This is very slow and poorly optimized but Java is anyways ¯\_(ツ)_/¯
    private final Map<Integer, Byte> mem = new HashMap<>();

    private Integer cursor = 0;

    public byte get() {
        return this.mem.getOrDefault(this.cursor, (byte) 0);
    }

    public void put(byte b) {
        if (b == 0) this.mem.remove(this.cursor);
        this.mem.put(this.cursor, b);
    }

    public void left() {
        this.cursor--;
    }

    public void right() {
        this.cursor++;
    }

    public void dump() {
        System.out.println("=== MEMORY DUMP ===");

        for (var entry : mem.entrySet()) {
            System.out.printf("[%d] -> %d\n", entry.getKey(), entry.getValue());
        }
        System.out.printf("Cursor at %d\n", cursor);

        System.out.println("===================");
    }
}
