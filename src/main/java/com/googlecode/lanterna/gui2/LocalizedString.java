package com.googlecode.lanterna.gui2;

import com.googlecode.lanterna.bundle.LocalizedUiBundle;

import java.util.Locale;

/**
 * Set of predefined localized string.<br/>
 * All this strings are localized by using {@link LocalizedUiBundle}.<br/>
 * Changing the locale by calling {@link Locale#setDefault(Locale)}.
 * @author silveryocha.
 */
public class LocalizedString {

    public final static LocalizedString OK = new LocalizedString("short.label.ok");
    public final static LocalizedString Cancel = new LocalizedString("short.label.cancel");
    public final static LocalizedString Yes = new LocalizedString("short.label.yes");
    public final static LocalizedString No = new LocalizedString("short.label.no");
    public final static LocalizedString Close = new LocalizedString("short.label.close");
    public final static LocalizedString Abort = new LocalizedString("short.label.abort");
    public final static LocalizedString Ignore = new LocalizedString("short.label.ignore");
    public final static LocalizedString Retry = new LocalizedString("short.label.retry");
    public final static LocalizedString Continue = new LocalizedString("short.label.continue");

    private final String bundleKey;

    private LocalizedString(final String bundleKey) {
        this.bundleKey = bundleKey;
    }

    @Override
    public String toString() {
        return LocalizedUiBundle.get(Locale.getDefault(), bundleKey);
    }
}