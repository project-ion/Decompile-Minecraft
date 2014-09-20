/*   1:    */ public class aqj
/*   2:    */   extends vk
/*   3:    */ {
/*   4:    */   private final fn c;
/*   5:    */   private final String d;
/*   6:    */   
/*   7:    */   public aqj(aqi paramaqi, fn paramfn)
/*   8:    */   {
/*   9:302 */     this(paramaqi, paramfn.m("Properties"), paramfn.j("Type"), paramfn.f("Weight"));
/*  10:    */   }
/*  11:    */   
/*  12:    */   public aqj(aqi paramaqi, fn paramfn, String paramString)
/*  13:    */   {
/*  14:306 */     this(paramaqi, paramfn, paramString, 1);
/*  15:    */   }
/*  16:    */   
/*  17:    */   private aqj(aqi paramaqi, fn paramfn, String paramString, int paramInt)
/*  18:    */   {
/*  19:310 */     super(paramInt);
/*  20:313 */     if (paramString.equals("Minecart")) {
/*  21:314 */       if (paramfn != null) {
/*  22:315 */         paramString = adz.a(paramfn.f("Type")).b();
/*  23:    */       } else {
/*  24:317 */         paramString = "MinecartRideable";
/*  25:    */       }
/*  26:    */     }
/*  27:321 */     this.c = paramfn;
/*  28:322 */     this.d = paramString;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public fn a()
/*  32:    */   {
/*  33:326 */     fn localfn = new fn();
/*  34:    */     
/*  35:328 */     localfn.a("Properties", this.c);
/*  36:329 */     localfn.a("Type", this.d);
/*  37:330 */     localfn.a("Weight", this.a);
/*  38:    */     
/*  39:332 */     return localfn;
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqj
 * JD-Core Version:    0.7.0.1
 */