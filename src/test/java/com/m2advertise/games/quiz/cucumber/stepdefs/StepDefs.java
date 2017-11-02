package com.m2advertise.games.quiz.cucumber.stepdefs;

import com.m2advertise.games.quiz.M2AdvertiseQuizApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = M2AdvertiseQuizApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
