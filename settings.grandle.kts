pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "BibleStudium"
include(":app")
```

4. Cliquez le bouton vert **"Commit changes"** en bas

---

## 📋 Étape 2 — Créer le fichier racine build

Cliquez **"Add file"** → **"Create new file"**, nom :
```
build.gradle.kts
