package dependencies

object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.2.0"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Kotlin.version}"
        val playServices = "com.google.gms:google-services:4.1.0"
        val safeArgs = "android.arch.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.version}"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.0.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.0.0"
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.2"
        val testRunner = "androidx.test:runner:1.1.0-alpha3"
        val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        val espressoCore = "androidx.test.espresso:espresso-core:3.1.0-alpha3"
        val design = "com.google.android.material:material:1.1.0-alpha01"
        val coreKtx = "androidx.core:core-ktx:1.0.0-alpha1"

        val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.0.0"
        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.0.0"
        val coreTesting = "androidx.arch.core:core-testing:2.0.0"

        object Room {
            val version = "2.1.0-alpha03"
            val compiler = "androidx.room:room-compiler:$version"
            val runtime = "androidx.room:room-runtime:$version"
        }

        object Navigation {
            val version = "1.0.0-alpha08"
            val runtime = "android.arch.navigation:navigation-runtime:$version"
            val runtimeKtx = "android.arch.navigation:navigation-runtime-ktx:$version"
            val fragment = "android.arch.navigation:navigation-fragment:$version"
            val ui = "android.arch.navigation:navigation-ui:$version"
            val fragmentKtx = "android.arch.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "android.arch.navigation:navigation-ui-ktx:$version"
            val testingKtx = "android.arch.navigation:navigation-testing-ktx:$version"
        }
    }

    object Kotlin {
        val version = "1.3.11"
        val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        val coroutinesVersion = "1.0.1"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        val androidCoroutinesDispatcher = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        val coroutinesReactive = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutinesVersion"
        val androidCoroutines = "net.devrieze:android-coroutines:0.7.0"
        val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVersion"
        val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.8.1-rc13"
        val jvmModuleTest = "org.jetbrains.kotlin:kotlin-test"
        val jvmModuleTestJunit = "org.jetbrains.kotlin:kotlin-test-junit"
        val commonModuleTest = "org.jetbrains.kotlin:kotlin-test-common"
        val commonModuleTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common"
    }

    object Firebase {
        val core = "com.google.firebase:firebase-core:16.0.4"
        val fireStore = "com.google.firebase:firebase-firestore:17.1.3"
        val auth = "com.google.firebase:firebase-auth:16.0.5"
    }

    object PlayServices {
        val auth = "com.google.android.gms:play-services-auth:16.0.1"
    }

    object Dagger {
        val version = "2.16"
        val core = "com.google.dagger:dagger:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val android = "com.google.dagger:dagger-android:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        val assistedInjectAnnotations = "com.squareup.inject:assisted-inject-annotations-dagger2:0.3.0"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.3.0"
    }

    object Ktor {
        val version = "1.0.1"
        val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        val jsonJvm = "io.ktor:ktor-client-json-jvm:$version"
    }

    object OkHttp {
        val version = "3.11.0"
        val client = "com.squareup.okhttp3:okhttp:$version"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    val liveDataKtx = "com.shopify:livedata-ktx:2.0.1"

    object LeakCanary {
        val version = "1.6.2"
        val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
        val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:$version"
        val leakCanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:$version"
    }

    object Stetho {
        val stetho = "com.facebook.stetho:stetho:1.5.0"
    }

    object Hyperion {
        val version = "0.9.24"
        val hyperionPlugins = listOf(
            "com.willowtreeapps.hyperion:hyperion-core:$version",
            "com.willowtreeapps.hyperion:hyperion-attr:$version",
            "com.willowtreeapps.hyperion:hyperion-measurement:$version",
            "com.willowtreeapps.hyperion:hyperion-disk:$version",
            "com.willowtreeapps.hyperion:hyperion-recorder:$version",
            "com.willowtreeapps.hyperion:hyperion-phoenix:$version",
            "com.willowtreeapps.hyperion:hyperion-crash:$version",
            "com.willowtreeapps.hyperion:hyperion-shared-preferences:$version",
            "com.willowtreeapps.hyperion:hyperion-geiger-counter:$version",
            "com.willowtreeapps.hyperion:hyperion-build-config:$version"
        )
    }

    object Groupie {
        val version = "2.1.0"
        val groupie = "com.xwray:groupie:$version"
        val databinding = "com.xwray:groupie-databinding:$version"
    }

    object Klock {
        val version = "1.0.0"
        val common = "com.soywiz:klock:$version"
        val jvm = "com.soywiz:klock-jvm:$version"
    }

    object KotlinLogging {
        val kotlinLogging = "io.github.microutils:kotlin-logging:1.6.20"
    }

    val junit = "junit:junit:4.12"

    object KotlinTest {
        val assertions = "io.kotlintest:kotlintest-assertions:3.1.10"
    }

    object MockK {
        val jvm = "io.mockk:mockk:1.8.13.kotlin13"
        val common = "io.mockk:mockk-common:1.8.13.kotlin13"
    }

    object InjectedVmProvider {
        val version = 2.0
        val injectedVmProvider = "me.tatarka.injectedvmprovider:injectedvmprovider:$version"
        val extension = "me.tatarka.injectedvmprovider:injectedvmprovider-extensions:$version"
        val ktx = "me.tatarka.injectedvmprovider:injectedvmprovider-ktx:$version"
    }

    object Picasso {
        val picasso = "com.squareup.picasso:picasso:2.71828"
        val picassoTransformation = "jp.wasabeef:picasso-transformations:2.2.1"
    }
}