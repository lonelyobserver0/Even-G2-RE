package com.dexterous.flutterlocalnotifications.models;

import G2.a;
import android.graphics.Color;
import androidx.annotation.Keep;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NotificationAction implements Serializable {
    private static final String ALLOW_GENERATED_REPLIES = StubApp.getString2(9916);
    private static final String CANCEL_NOTIFICATION = StubApp.getString2(9782);
    private static final String CONTEXTUAL = StubApp.getString2(9917);
    private static final String ICON = StubApp.getString2(727);
    private static final String ICON_SOURCE = StubApp.getString2(9918);
    private static final String ID = StubApp.getString2(290);
    private static final String INPUTS = StubApp.getString2(9919);
    private static final String INVISIBLE = StubApp.getString2(9920);
    private static final String SEMANTIC_ACTION = StubApp.getString2(750);
    private static final String SHOWS_USER_INTERFACE = StubApp.getString2(749);
    private static final String TITLE = StubApp.getString2(616);
    private static final String TITLE_COLOR_ALPHA = StubApp.getString2(9921);
    private static final String TITLE_COLOR_BLUE = StubApp.getString2(9922);
    private static final String TITLE_COLOR_GREEN = StubApp.getString2(9923);
    private static final String TITLE_COLOR_RED = StubApp.getString2(9924);
    public final List<a> actionInputs = new ArrayList();
    public final Boolean allowGeneratedReplies;
    public final Boolean cancelNotification;
    public final Boolean contextual;
    public final String icon;
    public final IconSource iconSource;
    public final String id;
    public final Boolean invisible;
    public final Integer semanticAction;
    public final Boolean showsUserInterface;
    public final String title;
    public final Integer titleColor;

    public NotificationAction(Map<String, Object> map) {
        List<Map> list;
        this.id = (String) map.get(ID);
        this.cancelNotification = (Boolean) map.get(CANCEL_NOTIFICATION);
        this.title = (String) map.get(TITLE);
        Integer num = (Integer) map.get(TITLE_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(TITLE_COLOR_RED);
        Integer num3 = (Integer) map.get(TITLE_COLOR_GREEN);
        Integer num4 = (Integer) map.get(TITLE_COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            this.titleColor = null;
        } else {
            this.titleColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        this.icon = (String) map.get(ICON);
        this.contextual = (Boolean) map.get(CONTEXTUAL);
        this.showsUserInterface = (Boolean) map.get(SHOWS_USER_INTERFACE);
        this.allowGeneratedReplies = (Boolean) map.get(ALLOW_GENERATED_REPLIES);
        this.semanticAction = (Integer) map.get(SEMANTIC_ACTION);
        this.invisible = (Boolean) map.get(INVISIBLE);
        Integer num5 = (Integer) map.get(ICON_SOURCE);
        if (num5 != null) {
            this.iconSource = IconSource.values()[num5.intValue()];
        } else {
            this.iconSource = null;
        }
        if (map.get(INPUTS) == null || (list = (List) map.get(INPUTS)) == null) {
            return;
        }
        for (Map map2 : list) {
            this.actionInputs.add(new a(castList(String.class, (Collection) map2.get("choices")), (Boolean) map2.get("allowFreeFormInput"), (String) map2.get("label"), castList(String.class, (Collection) map2.get("allowedMimeTypes"))));
        }
    }

    public static <T> List<T> castList(Class<? extends T> cls, Collection<?> collection) {
        if (collection == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(cls.cast(it.next()));
            } catch (ClassCastException unused) {
            }
        }
        return arrayList;
    }
}
