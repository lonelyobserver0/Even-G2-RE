package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(CharSequence charSequence, int i3) {
        int charCount;
        int charCount2;
        int charCount3;
        int length = charSequence.length();
        int i10 = length - 1;
        if (i3 >= i10) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i3);
        int charCount4 = Character.charCount(codePointAt);
        int i11 = i3 + charCount4;
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i11) == 13) {
                charCount4++;
            }
            return i3 + charCount4;
        }
        if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i11 >= i10 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, i11))) {
                return i11;
            }
            int i13 = i3;
            while (i13 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i3))) {
                i13 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                i12++;
            }
            if (i12 % 2 == 0) {
                charCount4 += 2;
            }
            return i3 + charCount4;
        }
        if (isKeycapBase(codePointAt)) {
            charCount4 += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i11);
            int charCount5 = Character.charCount(codePointBefore) + i11;
            if (charCount5 >= length || !isVariationSelector(codePointBefore)) {
                if (isKeycapBase(codePointBefore)) {
                    charCount3 = Character.charCount(codePointBefore);
                    charCount4 += charCount3;
                }
                return i3 + charCount4;
            }
            int codePointAt2 = Character.codePointAt(charSequence, charCount5);
            if (isKeycapBase(codePointAt2)) {
                charCount3 = Character.charCount(codePointAt2) + Character.charCount(codePointBefore);
                charCount4 += charCount3;
            }
            return i3 + charCount4;
        }
        if (isEmoji(codePointAt)) {
            boolean z2 = false;
            int i14 = 0;
            do {
                if (z2) {
                    charCount4 = Character.charCount(codePointAt) + i14 + 1 + charCount4;
                    z2 = false;
                }
                if (isEmojiModifier(codePointAt)) {
                    break;
                }
                if (i11 < length) {
                    codePointAt = Character.codePointAt(charSequence, i11);
                    int charCount6 = Character.charCount(codePointAt) + i11;
                    if (codePointAt != 8419) {
                        if (isEmojiModifier(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (isVariationSelector(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (codePointAt == 8205) {
                            codePointAt = Character.codePointAt(charSequence, charCount6);
                            i11 = Character.charCount(codePointAt) + charCount6;
                            if (i11 >= length || !isVariationSelector(codePointAt)) {
                                i14 = 0;
                            } else {
                                codePointAt = Character.codePointAt(charSequence, i11);
                                int charCount7 = Character.charCount(codePointAt);
                                i11 = Character.charCount(codePointAt) + i11;
                                i14 = charCount7;
                            }
                            z2 = true;
                            if (i11 < length || !z2) {
                                break;
                                break;
                            }
                        } else {
                            i11 = charCount6;
                        }
                        charCount4 += charCount2;
                        break;
                    }
                    int codePointBefore2 = Character.codePointBefore(charSequence, charCount6);
                    int charCount8 = Character.charCount(codePointBefore2) + charCount6;
                    if (charCount8 >= length || !isVariationSelector(codePointBefore2)) {
                        if (isKeycapBase(codePointBefore2)) {
                            charCount = Character.charCount(codePointBefore2);
                            charCount4 += charCount;
                        }
                        return i3 + charCount4;
                    }
                    int codePointAt3 = Character.codePointAt(charSequence, charCount8);
                    if (isKeycapBase(codePointAt3)) {
                        charCount = Character.charCount(codePointAt3) + Character.charCount(codePointBefore2);
                        charCount4 += charCount;
                    }
                    return i3 + charCount4;
                }
                i14 = 0;
                if (i11 < length) {
                    break;
                }
            } while (isEmoji(codePointAt));
        }
        return i3 + charCount4;
    }

    public int getOffsetBefore(CharSequence charSequence, int i3) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int charCount3;
        int i10 = 0;
        int i11 = 1;
        if (i3 <= 1 || (charCount2 = i3 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i3))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i3 - charCount;
        }
        if (isRegionalIndicatorSymbol(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount4 > 0 && isRegionalIndicatorSymbol(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount4);
                charCount4 -= Character.charCount(codePointBefore2);
                i11++;
            }
            if (i11 % 2 == 0) {
                charCount += 2;
            }
            return i3 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount5 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount5 <= 0 || !isVariationSelector(codePointBefore3)) {
                if (isKeycapBase(codePointBefore3)) {
                    charCount3 = Character.charCount(codePointBefore3);
                    charCount += charCount3;
                }
                return i3 - charCount;
            }
            int codePointBefore4 = Character.codePointBefore(charSequence, charCount5);
            if (isKeycapBase(codePointBefore4)) {
                charCount3 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                charCount += charCount3;
            }
            return i3 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            int charCount6 = Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount6;
                if (charCount2 <= 0 || !isTagSpecChar(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount6 = Character.charCount(codePointBefore);
            }
            if (!isEmoji(codePointBefore)) {
                return i3 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (isVariationSelector(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!isEmoji(codePointBefore)) {
                return i3 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (isEmoji(codePointBefore)) {
            boolean z2 = false;
            int i12 = 0;
            while (true) {
                if (z2) {
                    charCount = Character.charCount(codePointBefore) + i12 + 1 + charCount;
                    z2 = false;
                }
                if (isEmojiModifier(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount7 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount7 > 0 && isVariationSelector(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount7);
                        if (!isEmoji(codePointBefore5)) {
                            return i3 - charCount;
                        }
                        i10 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (isEmojiModifierBase(codePointBefore5)) {
                        charCount += Character.charCount(codePointBefore5) + i10;
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !isVariationSelector(codePointBefore)) {
                                i12 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount8 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i12 = charCount8;
                            }
                            z2 = true;
                            if (charCount2 != 0 || !z2 || !isEmoji(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i12 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i3 - charCount;
    }

    public boolean isEmoji(int i3) {
        return this.flutterJNI.isCodePointEmoji(i3);
    }

    public boolean isEmojiModifier(int i3) {
        return this.flutterJNI.isCodePointEmojiModifier(i3);
    }

    public boolean isEmojiModifierBase(int i3) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i3);
    }

    public boolean isKeycapBase(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i3) {
        return this.flutterJNI.isCodePointRegionalIndicator(i3);
    }

    public boolean isTagSpecChar(int i3) {
        return 917536 <= i3 && i3 <= 917630;
    }

    public boolean isVariationSelector(int i3) {
        return this.flutterJNI.isCodePointVariantSelector(i3);
    }
}
