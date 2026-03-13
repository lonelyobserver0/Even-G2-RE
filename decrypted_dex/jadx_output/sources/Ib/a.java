package Ib;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a extends b {

    @JsonProperty("bootloader")
    public String bootloader;

    @JsonProperty("mode")
    public int mode = -1;

    @JsonProperty("no-downgrade")
    public boolean noDowngrade = false;

    @JsonCreator
    public a() {
    }
}
