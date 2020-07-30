<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', 'PageController@dashboard')->middleware('auth');

Route::get('/InsertBook', 'PageController@insertBook');

Route::get('/ListBook', 'PageController@listBook');

//Route::get('/login', 'LoginController@showLogin');

Auth::routes();

Route::get('/dashboard', 'DashboardController@index')->name('dashboard');
