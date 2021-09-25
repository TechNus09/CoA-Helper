package com.technus.coahelper.ui.rankup;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class
DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(PlayerName TEXT primary key,Combatlvl INTEGER,CombatXp INTEGER,CombatRank INTEGER,MiningLvl INTEGER,MiningXp INTEGER,MiningRank INTEGER,SmithingLvl INTEGER,SmithingXp INTEGER,SmithingRank INTEGER,WoodcuttingLvl INTEGER,WoodcuttingXp INTEGER,WoodcuttingRank INTEGER,CraftingLvl INTEGER,CraftingXp INTEGER,CraftingRank INTEGER,FishingLvl INTEGER,FishingXp INTEGER,FishingRank INTEGER,CookingLvl INTEGER,CookingXp INTEGER,CookingRank INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userdetails");
    }

    public Boolean insertUserData(String playerName, String combatL, String combatX, String combatR,
                                  String miningL,String miningX,String miningR,
                                  String smithingL,String smithingX,String smithingR,
                                  String woodcuttingL,String woodcuttingX,String woodcuttingR,
                                  String craftingL,String craftingX,String craftingR,
                                  String fishingL,String fishingX,String fishingR,
                                  String cookingL,String cookingX,String cookingR)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("PlayerName", playerName);
        contentValues.put("CombatLvl",combatL);
        contentValues.put("CombatXp",combatX);
        contentValues.put("CombatRank",combatR);
        contentValues.put("MiningLvl",miningL);
        contentValues.put("MiningXp",miningX);
        contentValues.put("MiningRank",miningR);
        contentValues.put("SmithingLvl",smithingL);
        contentValues.put("SmithingXp",smithingX);
        contentValues.put("SmithingRank",smithingR);
        contentValues.put("WoodcuttingLvl",woodcuttingL);
        contentValues.put("WoodcuttingXp",woodcuttingX);
        contentValues.put("WoodcuttingRank",woodcuttingR);
        contentValues.put("CraftingLvl",craftingL);
        contentValues.put("CraftingXp",craftingX);
        contentValues.put("CraftingRank",craftingR);
        contentValues.put("FishingLvl",fishingL);
        contentValues.put("FishingXp",fishingX);
        contentValues.put("FishingRank",fishingR);
        contentValues.put("CookingLvl",cookingL);
        contentValues.put("CookingXp",cookingX);
        contentValues.put("CookingRank",cookingR);

        long result=DB.insert("Userdetails", null, contentValues);
        return result != -1;
    }


    public Boolean updateUserData(String playerName, String combatL, String combatX, String combatR,
                                  String miningL,String miningX,String miningR,
                                  String smithingL,String smithingX,String smithingR,
                                  String woodcuttingL,String woodcuttingX,String woodcuttingR,
                                  String craftingL,String craftingX,String craftingR,
                                  String fishingL,String fishingX,String fishingR,
                                  String cookingL,String cookingX,String cookingR)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("CombatLvl",combatL);
        contentValues.put("CombatXp",combatX);
        contentValues.put("CombatRank",combatR);
        contentValues.put("MiningLvl",miningL);
        contentValues.put("MiningXp",miningX);
        contentValues.put("MiningRank",miningR);
        contentValues.put("SmithingLvl",smithingL);
        contentValues.put("SmithingXp",smithingX);
        contentValues.put("SmithingRank",smithingR);
        contentValues.put("WoodcuttingLvl",woodcuttingL);
        contentValues.put("WoodcuttingXp",woodcuttingX);
        contentValues.put("WoodcuttingRank",woodcuttingR);
        contentValues.put("CraftingLvl",craftingL);
        contentValues.put("CraftingXp",craftingX);
        contentValues.put("CraftingRank",craftingR);
        contentValues.put("FishingLvl",fishingL);
        contentValues.put("FishingXp",fishingX);
        contentValues.put("FishingRank",fishingR);
        contentValues.put("CookingLvl",cookingL);
        contentValues.put("CookingXp",cookingX);
        contentValues.put("CookingRank",cookingR);
        Cursor cursor = DB.rawQuery("Select * from Userdetails where playerName = ?", new String[]{playerName});
        if (cursor.getCount() > 0) {
            long result = DB.update("Userdetails", contentValues, "playerName=?", new String[]{playerName});
            return result != -1;
        } else {
            return false;
        }}


    public Boolean deleteUserData (String playerName)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Userdetails where playerName = ?", new String[]{playerName});
        if (cursor.getCount() > 0) {
            long result = DB.delete("Userdetails", "playerName=?", new String[]{playerName});
            return result != -1;
        }
        else {
            return false;
        }

    }

    public Cursor getUserData (String playerName)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Userdetails where playerName = ?", new String[]{playerName});
        return cursor;
    }

    public String[] GetNamesList() {

            try {
                SQLiteDatabase db = this.getReadableDatabase();
                Cursor x = db.rawQuery("SELECT * FROM Userdetails", null);
                int n=x.getCount();
                x.moveToFirst();
                String[] a=new String[n];int i=0;
                do
                {
                    a[i]=x.getString(x.getColumnIndex("PlayerName"));
                    i++;
                } while(x.moveToNext());

                x.close();
                return a;
            }
            catch (Exception e)
            {
                return null;
            }
        }

    public  Cursor getUserXp(String playerName)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Userdetails where playerName = ?", new String[]{playerName});
        return cursor;
    }


}

