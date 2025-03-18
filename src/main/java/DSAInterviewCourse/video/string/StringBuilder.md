Absolutely! Here's a **list of commonly used `StringBuilder` methods** with simple examples for each. These are super useful to master:

---

## **Common `StringBuilder` Methods:**

| Method                              | Description                                                            | Example Output                                      |
|------------------------------------|------------------------------------------------------------------------|-----------------------------------------------------|
| **`append(String str)`**            | Adds text at the end.                                                  | `"Hello".append(" World") → Hello World`             |
| **`insert(int offset, String str)`**| Inserts text at specific index.                                        | `"Hello".insert(5, " Java") → Hello Java`            |
| **`replace(int start, int end, str)`**| Replaces substring between `start` and `end` with new text.            | `"Hello".replace(0, 2, "Yo") → Yollo`                |
| **`delete(int start, int end)`**   | Deletes characters from `start` to `end - 1`.                           | `"Hello".delete(1, 3) → Hlo`                         |
| **`deleteCharAt(int index)`**      | Deletes character at specific index.                                   | `"Hello".deleteCharAt(1) → Hllo`                     |
| **`reverse()`**                    | Reverses the string content.                                           | `"Hello".reverse() → olleH`                          |
| **`charAt(int index)`**            | Returns char at index.                                                 | `"Hello".charAt(1) → e`                              |
| **`setCharAt(int index, char c)`** | Changes char at specific index.                                        | `"Hello".setCharAt(1, 'a') → Hallo`                  |
| **`length()`**                     | Returns current length.                                                | `"Hello".length() → 5`                               |
| **`capacity()`**                   | Returns capacity (initial + growth factor).                            | Default is `16` + length                             |
| **`ensureCapacity(int min)`**      | Ensures at least `min` capacity (grows if needed).                      | Increases buffer space                               |
| **`substring(int start, int end)`**| Returns part of String (same as `String` method).                       | `"Hello World".substring(0, 5) → Hello`              |
| **`toString()`**                   | Converts to regular immutable `String`.                                | `"Hello".toString()` → `"Hello"`                     |

---

## **Example Code (All Methods Together):**

```java
public class StringBuilderMethodsDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println("append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("insert: " + sb);

        // Replace
        sb.replace(6, 10, "Awesome");
        System.out.println("replace: " + sb);

        // Delete
        sb.delete(5, 12);
        System.out.println("delete: " + sb);

        // Delete single character
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("reverse: " + sb);

        // Reverse back
        sb.reverse();
        System.out.println("reverse back: " + sb);

        // charAt
        System.out.println("charAt(2): " + sb.charAt(2));

        // setCharAt
        sb.setCharAt(2, 'Z');
        System.out.println("setCharAt: " + sb);

        // Length
        System.out.println("length: " + sb.length());

        // Capacity
        System.out.println("capacity: " + sb.capacity());

        // Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensuring: " + sb.capacity());

        // Substring
        System.out.println("substring(0,5): " + sb.substring(0, 5));

        // toString
        String finalStr = sb.toString();
        System.out.println("Final String: " + finalStr);
    }
}
```


