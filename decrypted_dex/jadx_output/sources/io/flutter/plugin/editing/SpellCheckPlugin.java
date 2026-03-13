package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import com.stub.StubApp;
import gb.b0;
import gb.c0;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.localization.LocalizationPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SpellCheckPlugin implements b0, SpellCheckerSession.SpellCheckerSessionListener {
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    private final c0 mSpellCheckChannel;
    private SpellCheckerSession mSpellCheckerSession;
    private final TextServicesManager mTextServicesManager;
    MethodChannel.Result pendingResult;
    public static final String END_INDEX_KEY = StubApp.getString2(18703);
    public static final String START_INDEX_KEY = StubApp.getString2(18702);
    public static final String SUGGESTIONS_KEY = StubApp.getString2(18704);

    public SpellCheckPlugin(TextServicesManager textServicesManager, c0 c0Var) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = c0Var;
        c0Var.f14326a = this;
    }

    public void destroy() {
        this.mSpellCheckChannel.f14326a = null;
        SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    @Override // gb.b0
    public void initiateSpellCheck(String str, String str2, MethodChannel.Result result) {
        if (this.pendingResult != null) {
            result.error(StubApp.getString2(435), StubApp.getString2(18701), null);
        } else {
            this.pendingResult = result;
            performSpellCheck(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put(StubApp.getString2(18702), Integer.valueOf(offsetAt));
                hashMap.put(StubApp.getString2(18703), Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i10 = 0; i10 < suggestionsCount; i10++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i10);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap.put(StubApp.getString2(18704), arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.pendingResult.success(arrayList);
        this.pendingResult = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }

    public void performSpellCheck(String str, String str2) {
        Locale localeFromString = LocalizationPlugin.localeFromString(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, localeFromString, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }
}
