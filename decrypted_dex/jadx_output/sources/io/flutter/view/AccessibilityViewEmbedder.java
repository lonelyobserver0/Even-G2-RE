package io.flutter.view;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = StubApp.getString2(17879);
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final m reflectionAccessors = new m();
    private final SparseArray<n> flutterIdToOrigin = new SparseArray<>();
    private final Map<n, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto L82
            io.flutter.view.m r1 = r5.reflectionAccessors
            r2 = 17879(0x45d7, float:2.5054E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.reflect.Field r3 = r1.f15214c
            if (r3 == 0) goto L4a
            java.lang.reflect.Method r1 = r1.f15215d
            if (r1 != 0) goto L19
            goto L4a
        L19:
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            r1.getClass()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            goto L4b
        L2f:
            r1 = move-exception
            goto L35
        L31:
            r1 = move-exception
            goto L35
        L33:
            r1 = move-exception
            goto L40
        L35:
            r3 = 18890(0x49ca, float:2.647E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            android.util.Log.w(r2, r3, r1)
            goto L4a
        L40:
            r3 = 18891(0x49cb, float:2.6472E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            android.util.Log.w(r2, r3, r1)
        L4a:
            r1 = 0
        L4b:
            if (r1 != 0) goto L4e
            goto L7f
        L4e:
            long r1 = r1.longValue()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            io.flutter.view.n r2 = new io.flutter.view.n
            r2.<init>(r7, r1)
            java.util.Map<io.flutter.view.n, java.lang.Integer> r3 = r5.originToFlutterId
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L70
            java.util.Map<io.flutter.view.n, java.lang.Integer> r1 = r5.originToFlutterId
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L7a
        L70:
            int r2 = r5.nextFlutterId
            int r3 = r2 + 1
            r5.nextFlutterId = r3
            r5.cacheVirtualIdMappings(r7, r1, r2)
            r1 = r2
        L7a:
            android.view.View r2 = r5.rootAccessibilityView
            r8.addChild(r2, r1)
        L7f:
            int r0 = r0 + 1
            goto L1
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(View view, int i3, int i10) {
        n nVar = new n(view, i3);
        this.originToFlutterId.put(nVar, Integer.valueOf(i10));
        this.flutterIdToOrigin.put(i10, nVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i3);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
        accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
        accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        this.reflectionAccessors.getClass();
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        Parcel obtain2 = Parcel.obtain();
        obtain2.setDataPosition(0);
        obtain.writeToParcel(obtain2, 0);
        obtain2.setDataPosition(0);
        long readLong = obtain2.readLong();
        if (m.b(0, readLong)) {
            obtain2.readInt();
        }
        if (m.b(1, readLong)) {
            obtain2.readLong();
        }
        if (m.b(2, readLong)) {
            obtain2.readInt();
        }
        Long valueOf = m.b(3, readLong) ? Long.valueOf(obtain2.readLong()) : null;
        obtain2.recycle();
        if (valueOf == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new n(view, (int) (valueOf.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f15216a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(nVar.f15217b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i3, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a3 = m.a(this.reflectionAccessors, accessibilityRecord);
        if (a3 == null) {
            return null;
        }
        return this.originToFlutterId.get(new n(view, (int) (a3.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            io.flutter.view.m r1 = r5.reflectionAccessors
            r2 = 17879(0x45d7, float:2.5054E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.reflect.Method r1 = r1.f15212a
            r3 = 0
            if (r1 != 0) goto L13
            goto L36
        L13:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            goto L37
        L1d:
            r1 = move-exception
            goto L21
        L1f:
            r1 = move-exception
            goto L2c
        L21:
            r4 = 18892(0x49cc, float:2.6473E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            android.util.Log.w(r2, r4, r1)
            goto L36
        L2c:
            r4 = 18893(0x49cd, float:2.6475E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            android.util.Log.w(r2, r4, r1)
        L36:
            r1 = r3
        L37:
            if (r1 != 0) goto L3a
            return r3
        L3a:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.embeddedViewToDisplayBounds
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.cacheVirtualIdMappings(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.convertToFlutterNode(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f15216a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i10] = pointerProperties;
            motionEvent.getPointerProperties(i10, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i10, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i10] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i10, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null || (accessibilityNodeProvider = nVar.f15216a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(nVar.f15217b, i10, bundle);
    }

    public View platformViewOfNode(int i3) {
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return null;
        }
        return nVar.f15216a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a3 = m.a(this.reflectionAccessors, accessibilityEvent);
        if (a3 != null) {
            int longValue = (int) (a3.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new n(view, longValue));
            if (num == null) {
                int i3 = this.nextFlutterId;
                this.nextFlutterId = i3 + 1;
                Integer valueOf = Integer.valueOf(i3);
                cacheVirtualIdMappings(view, longValue, i3);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i10 = 0; i10 < obtain.getRecordCount(); i10++) {
                AccessibilityRecord record = obtain.getRecord(i10);
                Long a9 = m.a(this.reflectionAccessors, record);
                if (a9 != null) {
                    n nVar = new n(view, (int) (a9.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(nVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(nVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
