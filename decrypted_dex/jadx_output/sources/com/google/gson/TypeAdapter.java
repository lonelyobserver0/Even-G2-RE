package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TypeAdapter<T> {

    public final class NullSafeTypeAdapter extends TypeAdapter<T> {
        private NullSafeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) TypeAdapter.this.read2(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + TypeAdapter.this + "]";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t3) throws IOException {
            if (t3 == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.write(jsonWriter, t3);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read2(new JsonReader(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read2(new JsonTreeReader(jsonElement));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return !(this instanceof NullSafeTypeAdapter) ? new NullSafeTypeAdapter() : this;
    }

    /* renamed from: read */
    public abstract T read2(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t3) throws IOException {
        write(new JsonWriter(writer), t3);
    }

    public final JsonElement toJsonTree(T t3) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t3);
            return jsonTreeWriter.get();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t3) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t3) {
        StringBuilder sb2 = new StringBuilder();
        try {
            toJson(Streams.writerForAppendable(sb2), t3);
            return sb2.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }
}
