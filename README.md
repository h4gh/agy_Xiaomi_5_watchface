# Minimal LCD — Xiaomi Watch 5 (Wear OS 6)

Vlastní digitální ciferník ve formátu **Watch Face Format (WFF)** v nativním rozlišení **480 × 480 px** pro Xiaomi Watch 5.

## Jak nainstalovat z GitHub Actions
1. Otevři záložku **Actions** v tomto repozitáři a rozklikni nejnovější úspěšný běh **Build Minimal LCD Watch Face**.
2. Stáhni artefakt **MinimalLCD-watchface-debug** a rozbal `watchface-debug.apk`.
3. Na hodinkách zapni **Bezdrátové ladění** (*Nastavení → O hodinkách → 7× klepni na Číslo sestavení → Možnosti pro vývojáře → Ladění ADB + Bezdrátové ladění*).
4. Na PC spusť:
   ```bash
   adb connect <IP_HODINEK>:<PORT>
   adb install -r watchface-debug.apk
   ```
5. Po instalaci bezdrátové ladění na hodinkách zase vypni kvůli baterii.
