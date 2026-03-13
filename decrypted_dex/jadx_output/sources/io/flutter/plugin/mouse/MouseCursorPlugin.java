package io.flutter.plugin.mouse;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import com.stub.StubApp;
import gb.C0986o;
import gb.InterfaceC0985n;
import java.util.HashMap;

@TargetApi(24)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MouseCursorPlugin {
    private static HashMap<String, Integer> systemCursorConstants;
    private final MouseCursorViewDelegate mView;
    private final C0986o mouseCursorChannel;

    public interface MouseCursorViewDelegate {
        PointerIcon getSystemPointerIcon(int i3);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public MouseCursorPlugin(MouseCursorViewDelegate mouseCursorViewDelegate, C0986o c0986o) {
        this.mView = mouseCursorViewDelegate;
        this.mouseCursorChannel = c0986o;
        c0986o.f14364a = new InterfaceC0985n() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // gb.InterfaceC0985n
            public void activateSystemCursor(String str) {
                MouseCursorPlugin.this.mView.setPointerIcon(MouseCursorPlugin.this.resolveSystemCursor(str));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon resolveSystemCursor(String str) {
        if (systemCursorConstants == null) {
            systemCursorConstants = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                private static final long serialVersionUID = 1;

                {
                    put(StubApp.getString2(18724), 1010);
                    put(StubApp.getString2(18725), 1013);
                    put(StubApp.getString2(18726), 1000);
                    put(StubApp.getString2(18727), 1006);
                    put(StubApp.getString2(18728), 1002);
                    put(StubApp.getString2(18729), 1001);
                    put(StubApp.getString2(18730), 1011);
                    put(StubApp.getString2(18731), 1012);
                    put(StubApp.getString2(18732), 1020);
                    put(StubApp.getString2(18733), 1021);
                    put(StubApp.getString2(18734), 1003);
                    put(StubApp.getString2(18735), 1013);
                    put(StubApp.getString2(1337), 0);
                    put(StubApp.getString2(18736), 1012);
                    put(StubApp.getString2(18737), 1007);
                    put(StubApp.getString2(613), 1008);
                    put(StubApp.getString2(18738), 1014);
                    put(StubApp.getString2(18739), 1015);
                    String string2 = StubApp.getString2(18740);
                    put(string2, 1016);
                    put(StubApp.getString2(18741), 1017);
                    put(StubApp.getString2(18742), 1014);
                    put(StubApp.getString2(18743), 1014);
                    put(StubApp.getString2(18744), 1014);
                    put(StubApp.getString2(18745), 1015);
                    put(StubApp.getString2(18746), 1015);
                    put(StubApp.getString2(18747), 1015);
                    put(string2, 1017);
                    put(StubApp.getString2(18748), 1016);
                    put(StubApp.getString2(18749), 1017);
                    put(StubApp.getString2(18750), 1016);
                    put(StubApp.getString2(18751), 1009);
                    put(StubApp.getString2(18752), 1004);
                    put(StubApp.getString2(18753), 1018);
                    put(StubApp.getString2(18754), 1019);
                }
            };
        }
        return this.mView.getSystemPointerIcon(systemCursorConstants.getOrDefault(str, 1000).intValue());
    }

    public void destroy() {
        this.mouseCursorChannel.f14364a = null;
    }
}
