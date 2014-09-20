/*   1:    */ import tv.twitch.broadcast.IStatCallbacks;
/*   2:    */ import tv.twitch.broadcast.RTMPState;
/*   3:    */ import tv.twitch.broadcast.StatType;
/*   4:    */ 
/*   5:    */ class dak
/*   6:    */   implements IStatCallbacks
/*   7:    */ {
/*   8:    */   dak(dai paramdai) {}
/*   9:    */   
/*  10:    */   public void statCallback(StatType paramStatType, long paramLong)
/*  11:    */   {
/*  12:250 */     switch (dal.a[paramStatType.ordinal()])
/*  13:    */     {
/*  14:    */     case 1: 
/*  15:253 */       this.a.h = RTMPState.lookupValue((int)paramLong);
/*  16:254 */       break;
/*  17:    */     case 2: 
/*  18:257 */       this.a.g = paramLong;
/*  19:    */     }
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     dak
 * JD-Core Version:    0.7.0.1
 */