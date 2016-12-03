package org.terasology

import org.terasology.entitySystem.systems.BaseComponentSystem
import org.terasology.entitySystem.systems.RegisterSystem
import org.terasology.logic.console.commandSystem.annotations.Command


@RegisterSystem
class KotlinCommands : BaseComponentSystem () {

  @Command(shortDescription = "Kotlin test command", runOnServer = false)
  fun testKotlin(): kotlin.String {
      val str = "Kotlin ran successfully!"
      return str
  }
}
