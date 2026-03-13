package com.mapbox.auto.value.gson;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public JsonElement f12374a;

    public b(JsonElement jsonElement) {
        this.f12374a = jsonElement;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.f12374a = (JsonElement) new GsonBuilder().create().fromJson(objectInputStream.readUTF(), JsonElement.class);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f12374a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f12374a, ((b) obj).f12374a);
    }

    public final int hashCode() {
        return Objects.hash(this.f12374a);
    }
}
