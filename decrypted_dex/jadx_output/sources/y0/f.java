package y0;

import P0.q;
import android.net.Uri;
import android.text.TextUtils;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C1406C;
import t0.C1710j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23372a = Pattern.compile(StubApp.getString2(24573));

    @Override // P0.q
    public final Object d(Uri uri, C1710j c1710j) {
        String string2 = StubApp.getString2(24574);
        String readLine = new BufferedReader(new InputStreamReader(c1710j, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f23372a.matcher(readLine);
            if (!matcher.matches()) {
                throw C1406C.b(string2 + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2("24575"), Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2("8779")));
            long time = simpleDateFormat.parse(group).getTime();
            if (!StubApp.getString2("4928").equals(matcher.group(2))) {
                long j = StubApp.getString2("4966").equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw C1406C.b(null, e10);
        }
    }
}
