import org.scalajs.linker.interface.ModuleSplitStyle
lazy val timecalculator = project.in(file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
        scalaVersion := "3.5.0",
        scalaJSUseMainModuleInitializer := true,
        scalaJSLinkerConfig ~= {
            _.withModuleKind(ModuleKind.ESModule)
                .withModuleSplitStyle(
                    ModuleSplitStyle.SmallModulesFor(List("particleSimulator"))
                )
        },
        libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0"
    )