package com.mapbox.bindgen;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Value {
    private Object contents;

    /* renamed from: com.mapbox.bindgen.Value$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private Value(Object obj) {
        this.contents = obj;
    }

    private void buildJson(JsonWriter jsonWriter) throws IOException {
        Object obj = this.contents;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Double) {
            jsonWriter.value(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            jsonWriter.value(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator it = ((List) this.contents).iterator();
            while (it.hasNext()) {
                ((Value) it.next()).buildJson(jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!(obj instanceof HashMap)) {
            throw new RuntimeException(StubApp.getString2(13184));
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((HashMap) this.contents).entrySet()) {
            jsonWriter.name((String) entry.getKey());
            ((Value) entry.getValue()).buildJson(jsonWriter);
        }
        jsonWriter.endObject();
    }

    public static Expected<String, Value> fromJson(String str) {
        try {
            return ExpectedFactory.createValue(fromJsonHelper(str));
        } catch (IOException e10) {
            return ExpectedFactory.createError(e10.getMessage());
        }
    }

    private static Value fromJsonHelper(String str) throws IOException {
        return read(new JsonReader(new StringReader(str)));
    }

    public static Value nullValue() {
        return new Value();
    }

    private static Value read(JsonReader jsonReader) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
            case 1:
                return new Value(jsonReader.nextString());
            case 2:
                String nextString = jsonReader.nextString();
                return (nextString.indexOf(46) > -1 || nextString.contains(StubApp.getString2(1958)) || nextString.contains(StubApp.getString2(4909))) ? new Value(Double.valueOf(nextString)) : new Value(Long.valueOf(nextString));
            case 3:
                return new Value(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return new Value();
            case 5:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return new Value((List<Value>) arrayList);
            case 6:
                HashMap hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return new Value((HashMap<String, Value>) hashMap);
            default:
                throw new IllegalArgumentException(StubApp.getString2(13185));
        }
    }

    public static Value valueOf(double d8) {
        return new Value(Double.valueOf(d8));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Value) {
            Object obj2 = this.contents;
            if (obj2 == null && ((Value) obj).contents == null) {
                return true;
            }
            if (obj2 == null) {
                return false;
            }
            Value value = (Value) obj;
            if (value.contents == null) {
                return false;
            }
            if (obj2.getClass().isAssignableFrom(value.contents.getClass())) {
                return this.contents.equals(value.contents);
            }
        }
        return this.contents.equals(obj);
    }

    public Object getContents() {
        return this.contents;
    }

    public int hashCode() {
        Object obj = this.contents;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toJson() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                buildJson(jsonWriter);
                jsonWriter.close();
            } finally {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return stringWriter.toString();
    }

    public String toString() {
        Object obj = this.contents;
        return obj == null ? "" : obj.toString();
    }

    public static Value valueOf(long j) {
        return new Value(Long.valueOf(j));
    }

    public Value(double d8) {
        this.contents = Double.valueOf(d8);
    }

    public static Value valueOf(boolean z2) {
        return new Value(Boolean.valueOf(z2));
    }

    public static Value valueOf(String str) {
        return new Value(str);
    }

    public Value(long j) {
        this.contents = Long.valueOf(j);
    }

    public static Value valueOf(List<Value> list) {
        return new Value(list);
    }

    public static Value valueOf(HashMap<String, Value> hashMap) {
        return new Value(hashMap);
    }

    public Value(boolean z2) {
        this.contents = Boolean.valueOf(z2);
    }

    public Value(String str) {
        this.contents = str;
    }

    public Value(List<Value> list) {
        this.contents = list;
    }

    public Value(HashMap<String, Value> hashMap) {
        this.contents = hashMap;
    }

    private Value() {
        this.contents = null;
    }
}
