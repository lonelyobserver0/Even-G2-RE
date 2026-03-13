package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i3, int i10) {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private String getPath(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i10 = this.stackSize;
            if (i3 >= i10) {
                return sb2.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i3];
            if (obj instanceof JsonArray) {
                i3++;
                if (i3 < i10 && (objArr[i3] instanceof Iterator)) {
                    int i11 = this.pathIndices[i3];
                    if (z2 && i11 > 0 && (i3 == i10 - 1 || i3 == i10 - 2)) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i3 = i3 + 1) < i10 && (objArr[i3] instanceof Iterator)) {
                sb2.append('.');
                String str = this.pathNames[i3];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i3++;
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private String nextName(boolean z2) throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z2 ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i3 = this.stackSize - 1;
        this.stackSize = i3;
        Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    private void push(Object obj) {
        int i3 = this.stackSize;
        Object[] objArr = this.stack;
        if (i3 == objArr.length) {
            int i10 = i3 * 2;
            this.stack = Arrays.copyOf(objArr, i10);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i10);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i10);
        }
        Object[] objArr2 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return asInt;
    }

    public JsonElement nextJsonElement() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) peekStack();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String asString = ((JsonPrimitive) popStack()).getAsString();
        int i3 = this.stackSize;
        if (i3 > 0) {
            int[] iArr = this.pathIndices;
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            boolean z2 = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) peekStack;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z2) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (peekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (peekStack instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (peekStack instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) peekStack;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (peekStack instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (peekStack == SENTINEL_CLOSED) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + peekStack.getClass().getName() + " is not supported");
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i3 = AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i3 == 1) {
            nextName(true);
            return;
        }
        if (i3 == 2) {
            endArray();
            return;
        }
        if (i3 == 3) {
            endObject();
            return;
        }
        if (i3 != 4) {
            popStack();
            int i10 = this.stackSize;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return "JsonTreeReader" + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return nextName(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
