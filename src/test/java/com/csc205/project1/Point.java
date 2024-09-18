package com.csc205.project1;

/*
prompts I used in ChatGPT:

    - Design & implement a class called Point that represents a location in the Cartesian plane.
Include (at a minimum) the following methods:
A constructor that takes x and y coordinates as double arguments
setX(double x), setY(double y) - standard setters
getX(), getY() - standard getters

    - I want you to include this: rotate(double angle) - rotates the point by a specified (radian) angle around the origin. The formula for rotation is as follows:
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)
Include a toString method as well.
 */

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n){
        this.x += n;
    }
    public void shiftY(double n){
        this.y += n;
    }
    public double distance(Point other) {
        double dx = this.x - other.getX();
        double dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void rotate(double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);
        double xNew = x * cosTheta - y * sinTheta;
        double yNew = x * sinTheta + y * cosTheta;
        this.x = xNew;
        this.y = yNew;
    }
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
