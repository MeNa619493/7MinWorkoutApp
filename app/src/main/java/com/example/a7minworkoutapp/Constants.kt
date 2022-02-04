package com.example.a7minworkoutapp

class Constants {
    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModel>{
            val exerciseList=ArrayList<ExerciseModel>()

            val jumpingJacks=ExerciseModel(1,"jumping jacks",R.drawable.ic_jumping_jacks,
            false,false)
            exerciseList.add(jumpingJacks)

            val wallSit=ExerciseModel(2,"wall sit",R.drawable.ic_wall_sit,
                false,false)
            exerciseList.add(wallSit)

            val pushUp=ExerciseModel(3,"push up",R.drawable.ic_push_up,
                false,false)
            exerciseList.add(pushUp)

            val abdominalCrunch=ExerciseModel(4,"abdominal crunch",R.drawable.ic_abdominal_crunch,
                false,false)
            exerciseList.add(abdominalCrunch)

            val stepUpOnChair=ExerciseModel(5,"step up on chair",R.drawable.ic_step_up_onto_chair,
                false,false)
            exerciseList.add(stepUpOnChair)

            val squat=ExerciseModel(6,"squat",R.drawable.ic_squat,
                false,false)
            exerciseList.add(squat)

            val tricepsDipOnChair=ExerciseModel(7,"triceps dip on chair",R.drawable.ic_triceps_dip_on_chair,
                false,false)
            exerciseList.add(tricepsDipOnChair)

            val plank=ExerciseModel(8,"plank",R.drawable.ic_plank,
                false,false)
            exerciseList.add(plank)

            val highKneesRunningInPlace=ExerciseModel(9,"high knees running in place",R.drawable.ic_high_knees_running_in_place,
                false,false)
            exerciseList.add(highKneesRunningInPlace)

            val lunge=ExerciseModel(10,"lunge",R.drawable.ic_lunge,
                false,false)
            exerciseList.add(lunge)

            val pushUpAndRotation=ExerciseModel(11,"push up and rotation",R.drawable.ic_push_up_and_rotation,
                false,false)
            exerciseList.add(pushUpAndRotation)

            val sidePlank=ExerciseModel(12,"side plank",R.drawable.ic_side_plank,
                false,false)
            exerciseList.add(sidePlank)

            return exerciseList
        }
    }
}