package Kb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a extends Hb.b {

    @JsonProperty("images")
    public C0000a[] images;

    @JsonProperty("splitStatus")
    public int splitStatus;

    /* renamed from: Kb.a$a, reason: collision with other inner class name */
    public static class C0000a {

        @JsonProperty("active")
        public boolean active;

        @JsonProperty("bootable")
        public boolean bootable;

        @JsonProperty("confirmed")
        public boolean confirmed;

        @JsonProperty("hash")
        public byte[] hash;

        @JsonProperty("image")
        public int image;

        @JsonProperty("pending")
        public boolean pending;

        @JsonProperty("permanent")
        public boolean permanent;

        @JsonProperty("slot")
        public int slot;

        @JsonProperty("version")
        public String version;

        @JsonCreator
        public C0000a() {
        }
    }

    @JsonCreator
    public a() {
    }
}
