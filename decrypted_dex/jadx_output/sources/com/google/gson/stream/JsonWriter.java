package com.google.gson.stream;

import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private FormattingStyle formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private Strictness strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            REPLACEMENT_CHARS[i3] = String.format("\\u%04x", Integer.valueOf(i3));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    private static boolean alwaysCreatesValidJsonNumber(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void beforeName() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(this.formattedComma);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peek == 2) {
            this.out.append((CharSequence) this.formattedComma);
            newline();
        } else {
            if (peek == 4) {
                this.out.append((CharSequence) this.formattedColon);
                replaceTop(5);
                return;
            }
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.strictness != Strictness.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter closeScope(int i3, int i10, char c10) throws IOException {
        int peek = peek();
        if (peek != i10 && peek != i3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (peek == i10) {
            newline();
        }
        this.out.write(c10);
        return this;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.getNewline());
        int i3 = this.stackSize;
        for (int i10 = 1; i10 < i3; i10++) {
            this.out.write(this.formattingStyle.getIndent());
        }
    }

    private JsonWriter openScope(int i3, char c10) throws IOException {
        beforeValue();
        push(i3);
        this.out.write(c10);
        return this;
    }

    private int peek() {
        int i3 = this.stackSize;
        if (i3 != 0) {
            return this.stack[i3 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i3) {
        int i10 = this.stackSize;
        int[] iArr = this.stack;
        if (i10 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr2[i11] = i3;
    }

    private void replaceTop(int i3) {
        this.stack[this.stackSize - 1] = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void string(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
        L9:
            java.io.Writer r1 = r8.out
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.out
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.out
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.out
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.out
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return openScope(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return openScope(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i3 = this.stackSize;
        if (i3 > 1 || (i3 == 1 && this.stack[i3 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    public JsonWriter endArray() throws IOException {
        return closeScope(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return closeScope(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int peek = peek();
        if (peek != 3 && peek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle;
        this.formattedComma = ",";
        if (formattingStyle.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty();
    }

    public final void setHtmlSafe(boolean z2) {
        this.htmlSafe = z2;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z2) {
        setStrictness(z2 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z2) {
        this.serializeNulls = z2;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z2) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z2 ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f10) throws IOException {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f10);
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f10));
        return this;
    }

    public JsonWriter value(double d8) throws IOException {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d8);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d8));
        return this;
    }

    public JsonWriter value(long j) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!alwaysCreatesValidJsonNumber(cls)) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (this.strictness != Strictness.LENIENT) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
            }
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
