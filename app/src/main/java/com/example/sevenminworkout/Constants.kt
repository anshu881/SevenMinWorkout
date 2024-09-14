package com.example.sevenminworkout

object Constants {

    fun defaultExerciseList() :     ArrayList<ExerciseModel>{
        val excerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumping,
            false,
            false
        )
        excerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.wallsit,
            false,
            false
        )
        excerciseList.add(wallSit)
        val pushUp = ExerciseModel(
            3,
            "Push Up",
            R.drawable.pushup,
            false,
            false
        )
        excerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            4,
            "chair crusch",
            R.drawable.chair,
            false,
            false
        )
        excerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5,
            "step up on chair",
            R.drawable.chairworkout,
            false,
            false
        )
        excerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            6,
            "squat",
            R.drawable.squate,
            false,
            false
        )
        excerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            7,
            "tricep dip on chair",
            R.drawable.tricep,
            false,
            false
        )
        excerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            8,
            "plank",
            R.drawable.plank,
            false,
            false
        )
        excerciseList.add(plank)


        val highKneesRunningInPlace = ExerciseModel(
            9,
            "high knees running in place",
            R.drawable.kneeup,
            false,
            false
        )
        excerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(
            10,
            "lunges",
            R.drawable.lunge,
            false,
            false
        )
        excerciseList.add(lunges)


        val pushupAndRotation = ExerciseModel(
            11,
            "pushup and rotation",
            R.drawable.pushuprotation,
            false,
            false
        )
        excerciseList.add(pushupAndRotation)


        val sidePlank = ExerciseModel(
            12,
            "wall push up",
            R.drawable.wallpushup,
            false,
            false
        )
        excerciseList.add(sidePlank)


        return  excerciseList

    }

}