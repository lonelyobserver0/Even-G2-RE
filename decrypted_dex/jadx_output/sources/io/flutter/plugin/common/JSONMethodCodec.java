package io.flutter.plugin.common;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class JSONMethodCodec implements MethodCodec {
    public static final JSONMethodCodec INSTANCE = new JSONMethodCodec();

    private JSONMethodCodec() {
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public Object decodeEnvelope(ByteBuffer byteBuffer) {
        String string2 = StubApp.getString2(18674);
        try {
            Object decodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (decodeMessage instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) decodeMessage;
                if (jSONArray.length() == 1) {
                    return unwrapNull(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object unwrapNull = unwrapNull(jSONArray.opt(1));
                    Object unwrapNull2 = unwrapNull(jSONArray.opt(2));
                    if ((obj instanceof String) && (unwrapNull == null || (unwrapNull instanceof String))) {
                        throw new FlutterException((String) obj, (String) unwrapNull, unwrapNull2);
                    }
                }
            }
            throw new IllegalArgumentException(string2 + decodeMessage);
        } catch (JSONException e10) {
            throw new IllegalArgumentException(StubApp.getString2(18673), e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
        String string2 = StubApp.getString2(18675);
        try {
            Object decodeMessage = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (decodeMessage instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) decodeMessage;
                Object obj = jSONObject.get(StubApp.getString2("6738"));
                Object unwrapNull = unwrapNull(jSONObject.opt(StubApp.getString2("16030")));
                if (obj instanceof String) {
                    return new MethodCall((String) obj, unwrapNull);
                }
            }
            throw new IllegalArgumentException(string2 + decodeMessage);
        } catch (JSONException e10) {
            throw new IllegalArgumentException(StubApp.getString2(18673), e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeErrorEnvelope(String str, String str2, Object obj) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeErrorEnvelopeWithStacktrace(String str, String str2, Object obj, String str3) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(str).put(JSONUtil.wrap(str2)).put(JSONUtil.wrap(obj)).put(JSONUtil.wrap(str3)));
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeMethodCall(MethodCall methodCall) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StubApp.getString2("6738"), methodCall.method);
            jSONObject.put(StubApp.getString2("16030"), JSONUtil.wrap(methodCall.arguments));
            return JSONMessageCodec.INSTANCE.encodeMessage(jSONObject);
        } catch (JSONException e10) {
            throw new IllegalArgumentException(StubApp.getString2(18673), e10);
        }
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public ByteBuffer encodeSuccessEnvelope(Object obj) {
        return JSONMessageCodec.INSTANCE.encodeMessage(new JSONArray().put(JSONUtil.wrap(obj)));
    }

    public Object unwrapNull(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
