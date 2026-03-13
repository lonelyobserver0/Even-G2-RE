package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0424y extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9854a;

    public static C0424y a() {
        return new C0424y("Protocol message had invalid UTF-8.");
    }

    public static C0423x b() {
        return new C0423x("Protocol message tag had invalid wire type.");
    }

    public static C0424y c() {
        return new C0424y("CodedInputStream encountered a malformed varint.");
    }

    public static C0424y d() {
        return new C0424y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0424y e() {
        return new C0424y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
