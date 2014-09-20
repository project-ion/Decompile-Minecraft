/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkn
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:2005 */     if ((paramblf.c[ej.c.a()] != 0) && (!paramblf.b[ej.c.a()].d) && 
/*    9:2006 */       (paramblf.c[ej.b.a()] != 0) && (!paramblf.b[ej.b.a()].d))
/*   10:     */     {
/*   11:2007 */       blf localblf = paramblf.b[ej.c.a()];
/*   12:     */       
/*   13:2009 */       return (localblf.c[ej.b.a()] != 0) && (!localblf.b[ej.b.a()].d);
/*   14:     */     }
/*   15:2012 */     return false;
/*   16:     */   }
/*   17:     */   
/*   18:     */   public blb a(ej paramej, blf paramblf, Random paramRandom)
/*   19:     */   {
/*   20:2017 */     paramblf.d = true;
/*   21:2018 */     paramblf.b[ej.c.a()].d = true;
/*   22:2019 */     paramblf.b[ej.b.a()].d = true;
/*   23:2020 */     paramblf.b[ej.c.a()].b[ej.b.a()].d = true;
/*   24:2021 */     return new bkx(paramej, paramblf, paramRandom);
/*   25:     */   }
/*   26:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bkn
 * JD-Core Version:    0.7.0.1
 */