package fundamentals.level03

import fundamentals.level03.OptionExercises2.{HumanId, Job, JobId, findHumanById, findJobById}

/**
  * These exercises mirror the ones from `OptionExercises2.scala`,
  * they are for the purpose of teaching for-comprehension, which is very useful for working with `Option`.
  *
  * Please complete ForComprehension before proceeding.
  *
  *
  */
object OptionExercises3 {

  /**
    * scala> findJobIdByHumanIdUsingFor(1)
    * = None
    *
    * scala> findJobIdByHumanIdUsingFor(2)
    * = Some(1)
    */
  def findJobIdByHumanIdUsingFor(humanId: HumanId): Option[JobId] =
    for {
      human <- findHumanById(humanId)
      jobId <- human.optJobId
    } yield jobId

  /**
    * scala> findJobByHumanIdUsingFor(2)
    * = Some(Job("Teacher", "Expert in their field"))
    *
    * Hint: Use findJobIdByHumanIdUsingFor
    */
  def findJobByHumanIdUsingFor(humanId: HumanId): Option[Job] =
    for {
      jobId <- findJobIdByHumanIdUsingFor(humanId)
      job <- findJobById(jobId)
    } yield job

}
