package io.flutter.plugin.common;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class JSONMessageCodec implements MessageCodec<Object> {
    public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();

    private JSONMessageCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public Object decodeMessage(ByteBuffer byteBuffer) {
        String string2 = StubApp.getString2(18673);
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(StringCodec.INSTANCE.decodeMessage(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException(string2);
            }
            return nextValue;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(string2, e10);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object wrap = JSONUtil.wrap(obj);
        return wrap instanceof String ? StringCodec.INSTANCE.encodeMessage(JSONObject.quote((String) wrap)) : StringCodec.INSTANCE.encodeMessage(wrap.toString());
    }
}
